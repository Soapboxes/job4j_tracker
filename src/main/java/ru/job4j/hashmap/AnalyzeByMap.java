package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int ttlScore = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            if (pupil.subjects() != null) {
                for (Subject subject : pupil.subjects()) {
                    ttlScore += subject.score();
                    count++;
                }
            }
        }
        return (double) ttlScore / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            int sum = 0;
            for (Subject subject : subjects) {
                sum += subject.score();
            }
            double average = (double) sum / subjects.size();
            Label label = new Label(pupil.name(), average);
            result.add(label);
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        Map<String, Integer> subjectSum = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                subjectSum.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> entry : subjectSum.entrySet()) {
            String subjectName = entry.getKey();
            int ttlSum = entry.getValue();
            double average = (double) ttlSum / pupils.size();
            Label label = new Label(subjectName, average);
            result.add(label);
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            int sum = 0;
            for (Subject subject : subjects) {
                sum += subject.score();
            }
            Label label = new Label(pupil.name(), sum);
            result.add(label);

        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        Map<String, Integer> best = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                best.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> entry : best.entrySet()) {
            String subjectName = entry.getKey();
            int ttlSum = entry.getValue();
            Label label = new Label(subjectName, ttlSum);
            result.add(label);
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }
}



