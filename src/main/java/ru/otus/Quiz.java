package ru.otus;

/**
 * "Викторина"
 * @author Konstantin Boryagin
 * @version 1.0
 */
public class Quiz {


    public static void main(String[] args) {

        QuizGenerator quizGenerator = new QuizGenerator();

        System.out.println("Добро пожаловать! Введите Ваше имя что бы начать!");

        /** Получаем и записываем имя пользователя в {@link QuizGenerator#setPlayerName(String name)} */
        quizGenerator.setPlayerName(quizGenerator.getInput().nextLine());

        /**
         * Вызываем метод пошагового выполнения викторины {@link QuizGenerator#quiz()}
         * пока не будет введена "Q" для выхода из программы
         */
        while (true) {
            quizGenerator.quiz();

            System.out.println("\n Что бы выйти введите \"Q\" или что либо другое для следующей попытки");

            if (quizGenerator.getInput().next().equalsIgnoreCase("q")) {
                return;
            } else {
                System.out.println("Начнем заново!");
            }
        }
    }
}
