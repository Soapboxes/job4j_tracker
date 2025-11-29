package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

/**
 * Класс описывает работы бакновского сервиса по работе с добавлением и
 * уделением пользовотеля, добавлением аккаунта к пользователю.
 * Также поиск по паспорту, и реквизитам.
 * Метод транзакции по пересылке средств со счета на счет.
 * @author Soapboxes
 * @version 1.0
 */
public class BankService {
    /**
     * Коллекция для хранения данных по ключу (пользователь) и значение(список его счетов).
     * С использованием интерфейса HashMap для доступа к элементам.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Проверка существующего пользователя, добавелние если его не существует.
     * Метод putIfAbsent позволяет проверить, если ли такой ключ в карте или нет и если его нет, то произвести вставку данных.
     * @param user пользователь для добавления.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод, который позволит удалить пользователя из системы по номеру паспорта.
     * @param passport ключ (номер паспорта) пользователь для уделения.
     * @see #findByPassport(String)
     */
    public void deleteUser(String passport) {
        users.remove(findByPassport(passport));
    }

    /**
     * Добавление банковского счета пользователю.
     * Поиск пользователя по паспорту.
     * Счет добавляется если он не найден у пользователя.
     * @param passport поиск ключа (данные паспорта - пользователя)
     * @param account банковский счет: баланс и реквизиты для добавления.
     * @see #findByPassport(String)
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = users.get(user);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    /**
     * Поиск пользователя по номеру паспорта
     * поиск через ключ-значение. Где ключ это User (Map перебор)
     * @param passport паспортные данные(номер) пользователя.
     * @return возвращает найденного пользователя или null, если пользователь не найден.
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Поиск банковского счета пользователя по реквизитам.
     *  Пользователь находится по номеру паспорта через findByPassport
     *  после происходит поиск списка счетов у найденного пользователя и сравнивает их с поиском.
     * @param passport паспортные данные (номер) пользователя.
     * @param requisite реквизиты счета пользователя для поиска
     * @return возвращает найденный счет или null, если не найден счет или пользователь.
     * @see #findByPassport(String)
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account result = null;
        if (user != null) {
            List<Account> userAccounts = users.get(user);
            for (Account acc : userAccounts) {
                if (acc.getRequisite().equals(requisite)) {
                    result = acc;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт.
     * @param sourcePassport источник (с какого Аккаунта) перевода средств по паспорту
     * @param sourceRequisite  реквизиты счета - отправителя
     * @param destinationPassport назначение (кому) перевода средств по паспорту
     * @param destinationRequisite  назначение (получатель) перевода средств по реквизитам
     * @param amount значение (сумма) для перевода.
     * @return если счет найден и хватает средств для перевода возвращает true, иначе вернет false если аккаунты null, или недостаточно средств для перевода.
     * @see #findByRequisite(String, String)
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {

        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destAccount = findByRequisite(destinationPassport, destinationRequisite);

        if (sourceAccount == null || destAccount == null || sourceAccount.getBalance() < amount) {
            return false;
        }

        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);

        return true;
    }

    /**
     * Возвращает список банковских счетов пользователя.
     * @param user пользователь, для кого запрашивается счет.
     * @return список счетов пользователя или null, если пользователь не найден.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}