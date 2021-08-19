package ru.otus;

/**
 * enum в котором создаются вопросы для викторины со свойствами <b>correct</b>, <b>question</b> и <b>String[]</b>
 */
public enum Question {
    QUESTION_ONE (3, "Сколько примитивных типов данных в Java?",
            new String[] {"Десять", "Пять", "Восемь"}),
    QUESTION_TWO (4, "Какой из советских фильмов получил Оскар?",
            new String[] {"Кин-Дза-Дза","Сталкер", "Солярис", "Москва слезам не верит"}),
    QUESTION_THREE (1, "Чем является Milky Way",
            new String[] {"Галактика", "Скопление звёзд", "Парад планет", "Солнечная система", "Шоколадка"});

    /** Поле - правильный ответ*/
    private final int correctAnswer;
    /** Поле - вопрос*/
    private final String question;
    /** Поле - варианты ответов*/
    private final String[] answerOptions;

    /**
     * Конструктор создания нового вопроса для викторины
     * @param correctAnswer - номер правильного ответа
     * @param question - вопрос
     * @param answerOptions - массив с вариантами ответов
     */
    Question (int correctAnswer, String question, String[] answerOptions) {
        this.correctAnswer = correctAnswer;
        this.question = question;
        this.answerOptions = answerOptions;
    }

    /**
     * Метод получает значение размера массива {@link #answerOptions}
     * @return возвращает размер массива с вариантами ответов
     */
    public int answerOptionsLength() {
        return answerOptions.length;
    }

    /**
     * Получает значение поля {@link #correctAnswer}
     * @return правильный ответ на вопрос
     */
    public int getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * Получает значение поля {@link #question}
     * @return вопрос
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Получает массив вариантов ответов {@link #answerOptions}
     * @return массив с вариантами ответа на вопрос
     */
    public String[] getAnswerOptions() {
        return answerOptions;
    }

}
