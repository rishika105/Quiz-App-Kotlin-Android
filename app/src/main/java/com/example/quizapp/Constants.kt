package com.example.quizapp

import Question

object Constants {
    val USER_NAME: String = "user _name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"
    val QUIZ_TYPE: String = "quiz_type"

    enum class QuizType {
        FLAGS, GENERAL_KNOWLEDGE, VERBAL, REASONING
    }

    fun getQuestions(quizType: QuizType): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        when (quizType) {
            QuizType.FLAGS -> {
                // 1
                val questionOne = Question(
                    1,
                    "What country does this flag belongs to?",
                    R.drawable.ic_flag_of_argentina,
                    arrayListOf("Argentina", "Australia", "Armenia", "Austria"),
                    0,
                )
                questionsList.add(questionOne)

                // 2
                val questionTwo = Question(
                    2,
                    "What country does this flag belong to?",
                    R.drawable.ic_flag_of_australia,
                    arrayListOf("Angola", "Austria",
                        "Australia", "Armenia"),
                    2
                )
                questionsList.add(questionTwo)

                // 3
                val questionThree = Question(
                    3,
                    "What country does this flag belong to?",
                    R.drawable.ic_flag_of_brazil,
                    arrayListOf("Belarus", "Belize",
                        "Brunei", "Brazil"),
                    3
                )
                questionsList.add(questionThree)

                // 4
                val questionFour = Question(
                    4,
                    "What country does this flag belong to?",
                    R.drawable.ic_flag_of_belgium,
                    arrayListOf("Bahamas", "Belgium",
                        "Barbados", "Belize"),
                    1
                )
                questionsList.add(questionFour)

                // 5
                val questionFive = Question(
                    5,
                    "What country does this flag belong to?",
                    R.drawable.ic_flag_of_fiji,
                    arrayListOf("Gabon", "France",
                        "Fiji", "Finland"),
                    2
                )
                questionsList.add(questionFive)

                // 6
                val questionSix = Question(
                    6,
                    "What country does this flag belong to?",
                    R.drawable.ic_flag_of_germany,
                    arrayListOf("Germany", "Georgia",
                        "Greece", "none of these"),
                    0
                )

                questionsList.add(questionSix)

                // 7
                val questionSeven = Question(
                    7,
                    "What country does this flag belong to?",
                    R.drawable.ic_flag_of_denmark,
                    arrayListOf("Dominica", "Egypt",
                        "Denmark", "Ethiopia"),
                    2
                )
                questionsList.add(questionSeven)

                // 8
                val questionEight = Question(
                    8,
                    "What country does this flag belong to?",
                    R.drawable.ic_flag_of_india,
                    arrayListOf("Ireland", "Iran",
                        "Hungary", "India"),
                    3
                )
                questionsList.add(questionEight)

                // 9
                val questionNine = Question(
                    9,
                    "What country does this flag belong to?",
                    R.drawable.ic_flag_of_new_zealand,
                    arrayListOf("Australia", "New Zealand",
                        "Tuvalu", "United States of America"),
                    1
                )
                questionsList.add(questionNine)

                // 10
                val questionTen = Question(
                    10,
                    "What country does this flag belong to?",
                    R.drawable.ic_flag_of_kuwait,
                    arrayListOf("Kuwait", "Jordan",
                        "Sudan", "Palestine"),
                    0
                )
                questionsList.add(questionTen)
            }
            QuizType.GENERAL_KNOWLEDGE -> {
                // 1
                val questionOne = Question(
                    1,
                    "What is the capital of France?",
                    0,
                    arrayListOf("Paris", "London", "Berlin", "Rome"),
                    0,
                )
                questionsList.add(questionOne)

                // 2
                val questionTwo = Question(
                    2,
                    "Who is the CEO of SpaceX?",
                    0,
                    arrayListOf("Elon Musk", "Jeff Bezos", "Bill Gates", "Mark Zuckerberg"),
                    0
                )
                questionsList.add(questionTwo)

                // 3
                val questionThree = Question(
                    3,
                    "What is the largest planet in our solar system?",
                    0,
                    arrayListOf("Jupiter", "Saturn", "Uranus", "Neptune"),
                    0
                )
                questionsList.add(questionThree)

                // 4
                val questionFour = Question(
                    4,
                    "Who is the author of the book 'To Kill a Mockingbird'?",
                    0,
                    arrayListOf("F. Scott Fitzgerald", "Harper Lee", "Jane Austen", "J.K. Rowling"),
                    1
                )
                questionsList.add(questionFour)

                // 5
                val questionFive = Question(
                    5,
                    "What is the chemical symbol for gold?",
                    0,
                    arrayListOf("Ag", "Au", "Hg", "Pb"),
                    1
                )
                questionsList.add(questionFive)

                // 6
                val questionSix = Question(
                    6,
                    "Who is the founder of Microsoft?",
                    0,
                    arrayListOf("Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Larry Page"),
                    0
                )

                questionsList.add(questionSix)

                // 7
                val questionSeven = Question(
                    7,
                    "What is the largest living species of lizard?",
                    0,
                    arrayListOf("Komodo dragon", "Saltwater crocodile", "Black mamba", "African elephant"),
                    0
                )
                questionsList.add(questionSeven)

                // 8
                val questionEight = Question(
                    8,
                    "Who is the author of the book '1984'?",
                    0,
                    arrayListOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "Kurt Vonnegut"),
                    0
                )
                questionsList.add(questionEight)

                // 9
                val questionNine = Question(
                    9,
                    "What is the smallest country in the world?",
                    0,
                    arrayListOf("Vatican City", "Monaco", "Nauru", "Tuvalu"),
                    0
                )
                questionsList.add(questionNine)

                // 10
                val questionTen = Question(
                    10,
                    "Who is the CEO of Amazon?",
                    0,
                    arrayListOf("Jeff Bezos", "Elon Musk", "Bill Gates", "Mark Zuckerberg"),
                    0
                )
                questionsList.add(questionTen)
            }
            QuizType.VERBAL -> {
                // 1
                val questionOne = Question(
                    1,
                    "What is the meaning of the word 'perspicacious'?",
                    0,
                    arrayListOf("Having a strong and unpleasant smell", "Having a keen understanding and insight", "Having a strong and bitter taste", "Having a bright and cheerful color"),
                    1,
                )
                questionsList.add(questionOne)

                // 2
                val questionTwo = Question(
                    2,
                    "What is the meaning of the word 'enervate'?",
                    0,
                    arrayListOf("To give energy and strength", "To take away energy and strength", "To make something more interesting", "To make something less interesting"),
                    1
                )
                questionsList.add(questionTwo)

                // 3
                val questionThree = Question(
                    3,
                    "What is the meaning of the word 'fastidious'?",
                    0,
                    arrayListOf("Careless and sloppy", "Meticulous and demanding in one's standards", "Quick and efficient", "Slow and inefficient"),
                    1
                )
                questionsList.add(questionThree)

                // 4
                val questionFour = Question(
                    4,
                    "What is the meaning of the word 'heterogeneous'?",
                    0,
                    arrayListOf("Composed of different kinds of things", "Composed of similar kinds of things", "Having a strong and unpleasant smell", "Having a bright and cheerful color"),
                    0
                )
                questionsList.add(questionFour)

                // 5
                val questionFive = Question(
                    5,
                    "What is the meaning of the word 'insouciant'?",
                    0,
                    arrayListOf("Carefree and nonchalant", " Worried and anxious", "Happy and cheerful", "Sad and depressed"),
                    0
                )
                questionsList.add(questionFive)

                // 6
                val questionSix = Question(
                    6,
                    "What is the meaning of the word 'meritorious'?",
                    0,
                    arrayListOf("Deserving praise or reward", "Not deserving praise or reward", "Having a strong and unpleasant smell", "Having a bright and cheerful color"),
                    0
                )

                questionsList.add(questionSix)

                // 7
                val questionSeven = Question(
                    7,
                    "What is the meaning of the word 'malleable'?",
                    0,
                    arrayListOf("Capable of being shaped or molded", "Not capable of being shaped or molded", "Having a strong and unpleasant smell", "Having a bright and cheerful color"),
                    0
                )
                questionsList.add(questionSeven)

                // 8
                val questionEight = Question(
                    8,
                    "What is the meaning of the word 'narcissistic'?",
                    0,
                    arrayListOf("Having an excessive love for oneself", "Not having an excessive love for oneself", "Having a strong and unpleasant smell", "Having a bright and cheerful color"),
                    0
                )
                questionsList.add(questionEight)

                // 9
                val questionNine = Question(
                    9,
                    "What is the meaning of the word 'obfuscate'?",
                    0,
                    arrayListOf("To make something clear and easy to understand", "To make something unclear and difficult to understand", "Having a strong and unpleasant smell", "Having a bright and cheerful color"),
                    1
                )
                questionsList.add(questionNine)

                // 10
                val questionTen = Question(
                    10,
                    "What is the meaning of the word 'perspicacious'?",
                    0,
                    arrayListOf("Having a strong and unpleasant smell", "Having a keen understanding and insight", "Having a strong and bitter taste", "Having a bright and cheerful color"),
                    1
                )
                questionsList.add(questionTen)
            }
            QuizType.REASONING -> {
                // 1
                val questionOne = Question(
                    1,
                    "If it takes 5 machines 5 minutes to make 5 widgets, how long would it take 100 machines to make 100 widgets?",
                    0,
                    arrayListOf("5 minutes", "10 minutes", "15 minutes", "20 minutes"),
                    0,
                )
                questionsList.add(questionOne)

                // 2
                val questionTwo = Question(
                    2,
                    "A snail is at the bottom of a 20 foot well. Each day, it climbs up 3 feet, but at night, it slips back 2 feet. How many days will it take for the snail to reach the top of the well?",
                    0,
                    arrayListOf("10 days", "15 days", "20 days", "25 days"),
                    2
                )
                questionsList.add(questionTwo)

                // 3
                val questionThree = Question(
                    3,
                    "A bat and a ball together cost $1.10. The bat costs $1.00 more than the ball. How much does the ball cost?",
                    0,
                    arrayListOf("5 cents", "10 cents", "15 cents", "20 cents"),
                    0
                )
                questionsList.add(questionThree)

                // 4
                val questionFour = Question(
                    4,
                    "A woman has two coins that add up to 30 cents. One coin is not a nickel. What are the two coins?",
                    0,
                    arrayListOf("A quarter and a nickel", "A dime and a nickel", "A quarter and a dime", "A nickel and a nickel"),
                    2
                )
                questionsList.add(questionFour)

                // 5
                val questionFive = Question(
                    5,
                    "What can you break, even if you never pick it up or touch it?",
                    0,
                    arrayListOf("A promise", "A toy", "A book", "A chair"),
                    0
                )
                questionsList.add(questionFive)

                // 6
                val questionSix = Question(
                    6,
                    "What has keys but can't open locks?",
                    0,
                    arrayListOf("A piano", "A guitar", "A keyboard", "A door"),
                    0
                )

                questionsList.add(questionSix)

                // 7
                val questionSeven = Question(
                    7,
                    "What starts with an E, ends with an E, but only contains one letter?",
                    0,
                    arrayListOf("An envelope", "A letter", "A word", "A sentence"),
                    0
                )
                questionsList.add(questionSeven)

                // 8
                val questionEight = Question(
                    8,
                    "What is always coming but never arrives?",
                    0,
                    arrayListOf("Tomorrow", "Yesterday", "Today", "The future"),
                    0
                )
                questionsList.add(questionEight)

                // 9
                val questionNine = Question(
                    9,
                    "What is black and white and read all over?",
                    0,
                    arrayListOf("A newspaper", "A book", "A magazine", "A letter"),
                    0
                )
                questionsList.add(questionNine)

                // 10
                val questionTen = Question(
                    10,
                    "What has a head, a tail, but no body?",
                    0,
                    arrayListOf("A coin", "A stamp", "A pencil", "A pen"),
                    0
                )
                questionsList.add(questionTen)
            }
        }

        return questionsList
    }
}