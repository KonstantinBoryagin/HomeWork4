package ru.otus;

/**
 * Класс автоматически формирует вопросы получаемые из перечисления
 * @see Question#Question(int correctAnswer, String question, String[] answerOptions)  ;
 */
public class QuestionGenerator {

    /** Поле - общее количество вопросов заданных пользователю */
    private int countOfQuestions;

    /**
     * Формирует массив всех вопросов для викторины,
     * присваиваем значение счетчику общего количества вопросов {@link #countOfQuestions}
     * @return - массив всех вопросов с вариантами ответов
     */
    public Question[] formArrayOfQuestions() {
        Question[] arrayOfQuestions = Question.values();
        countOfQuestions = arrayOfQuestions.length;
        return arrayOfQuestions;
    }

    /**
     * Форматирует и выводит на экран вопрос и варинты ответа
     * @param question - содержит вопрос и варианты ответа
     */
    public void printQuestion(Question question) {
        System.out.println("\n" + question.getQuestion());
        int formatOutput = 0;
        for (int i = 0; i < question.answerOptionsLength(); i++) {
            System.out.printf("%3d"+ ". " + "%-20s", (i + 1), question.getAnswerOptions()[i]);
            formatOutput++;
            if (formatOutput % 2 == 0) {
                System.out.println();
            }
        }
        System.out.print("\n Введите номер ответа - ");
    }

    /**
     * Возвращает количество заданых вопросов
     * @return  количество вопросов заданных пользователю
     */
    public int getCountOfQuestions() {
        return countOfQuestions;
    }
}
