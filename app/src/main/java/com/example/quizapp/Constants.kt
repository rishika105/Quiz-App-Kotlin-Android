package com.example.quizapp

import com.example.quizapp.R

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val SCORE: String = "score"
    const val QUIZ_TYPE: String = "quiz_type"

    enum class QuizType {
        FLAGS, GENERAL_KNOWLEDGE, VERBAL, REASONING
    }
}

// Top-level function outside the Constants object
fun getQuestions(quizType: Constants.QuizType): ArrayList<Question> {
    val questionsList = ArrayList<Question>()

    when (quizType) {
        Constants.QuizType.FLAGS -> {
            // Add flag-related questions
            val questionOne = Question(
                1,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina,
                arrayListOf("Argentina", "Australia", "Armenia", "Austria"),
                0
            )
            questionsList.add(questionOne)

            // 2
            val questionTwo = Question(
                2,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_australia,
                arrayListOf("Angola", "Austria", "Australia", "Armenia"),
                2
            )
            questionsList.add(questionTwo)

            // 3
            val questionThree = Question(
                3,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                arrayListOf("Belarus", "Belize", "Brunei", "Brazil"),
                3
            )
            questionsList.add(questionThree)

            // 4
            val questionFour = Question(
                4,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_belgium,
                arrayListOf("Bahamas", "Belgium", "Barbados", "Belize"),
                1
            )
            questionsList.add(questionFour)

            // 5
            val questionFive = Question(
                5,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_fiji,
                arrayListOf("Gabon", "France", "Fiji", "Finland"),
                2
            )
            questionsList.add(questionFive)

            // 6
            val questionSix = Question(
                6,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_germany,
                arrayListOf("Germany", "Georgia", "Greece", "None of these"),
                0
            )
            questionsList.add(questionSix)

            // 7
            val questionSeven = Question(
                7,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_denmark,
                arrayListOf("Dominica", "Egypt", "Denmark", "Ethiopia"),
                2
            )
            questionsList.add(questionSeven)

            // 8
            val questionEight = Question(
                8,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_india,
                arrayListOf("Ireland", "Iran", "Hungary", "India"),
                3
            )
            questionsList.add(questionEight)

            // 9
            val questionNine = Question(
                9,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_new_zealand,
                arrayListOf("Australia", "New Zealand", "Tuvalu", "United States of America"),
                1
            )
            questionsList.add(questionNine)

            // 10
            val questionTen = Question(
                10,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_kuwait,
                arrayListOf("Kuwait", "Jordan", "Sudan", "Palestine"),
                0
            )
            questionsList.add(questionTen)
        }
        Constants.QuizType.GENERAL_KNOWLEDGE -> {
            // General Knowledge questions
            val questionOne = Question(
                1,
                "What is the capital of France?",
                0,
                arrayListOf("Paris", "London", "Berlin", "Rome"),
                0
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
        Constants.QuizType.VERBAL -> {
            // Verbal reasoning questions
            val questionOne = Question(
                1,
                "What is the meaning of the word 'perspicacious'?",
                0,
                arrayListOf("Having a strong and unpleasant smell", "Having a keen understanding and insight", "Having a strong and bitter taste", "Having a bright and cheerful color"),
                1
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
                arrayListOf("Carefree and nonchalant", "Worried and anxious", "Happy and cheerful", "Sad and depressed"),
                0
            )
            questionsList.add(questionFive)

            // 6
            val questionSix = Question(
                6,
                "What is the meaning of the word 'meritorious'?",
                0,
                arrayListOf("Worthy of praise or reward", "Deserving of punishment", "Lacking merit", "Unworthy of attention"),
                0
            )
            questionsList.add(questionSix)

            // 7
            val questionSeven = Question(
                7,
                "What is the meaning of the word 'sanguine'?",
                0,
                arrayListOf("Optimistic and cheerful", "Pessimistic and gloomy", "Indifferent and apathetic", "Angry and hostile"),
                0
            )
            questionsList.add(questionSeven)

            // 8
            val questionEight = Question(
                8,
                "What is the meaning of the word 'taciturn'?",
                0,
                arrayListOf("Talkative and chatty", "Reserved and silent", "Loud and boisterous", "Eager and enthusiastic"),
                1
            )
            questionsList.add(questionEight)

            // 9
            val questionNine = Question(
                9,
                "What is the meaning of the word 'ubiquitous'?",
                0,
                arrayListOf("Existing everywhere", "Existing nowhere", "Existing only in one place", "Existing in limited quantities"),
                0
            )
            questionsList.add(questionNine)

            // 10
            val questionTen = Question(
                10,
                "What is the meaning of the word 'vociferous'?",
                0,
                arrayListOf("Quiet and reserved", "Loud and clamorous", "Soft and gentle", "Calm and peaceful"),
                1
            )
            questionsList.add(questionTen)
        }
        Constants.QuizType.REASONING -> {
            // Reasoning questions
            val questionOne = Question(
                1,
                "If all roses are flowers and some flowers fade quickly, can we say some roses fade quickly?",
                0,
                arrayListOf("Yes", "No", "Cannot be determined", "None of the above"),
                2
            )
            questionsList.add(questionOne)

            // 2
            val questionTwo = Question(
                2,
                "If A is taller than B, and B is taller than C, who is the tallest?",
                0,
                arrayListOf("A", "B", "C", "Cannot be determined"),
                0
            )
            questionsList.add(questionTwo)

            // 3
            val questionThree = Question(
                3,
                "In a certain code language, if 'CAT' is coded as '3120', how will 'DOG' be coded?",
                0,
                arrayListOf("415", "712", "315", "4150"),
                0
            )
            questionsList.add(questionThree)

            // 4
            val questionFour = Question(
                4,
                "If it takes 3 people 4 hours to complete a task, how long will it take 6 people to complete the same task?",
                0,
                arrayListOf("2 hours", "4 hours", "6 hours", "8 hours"),
                0
            )
            questionsList.add(questionFour)

            // 5
            val questionFive = Question(
                5,
                "If the day after tomorrow is Wednesday, what day is today?",
                0,
                arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday"),
                1
            )
            questionsList.add(questionFive)

            // 6
            val questionSix = Question(
                6,
                "What is the next number in the series: 2, 4, 8, 16, ...?",
                0,
                arrayListOf("20", "24", "32", "64"),
                2
            )
            questionsList.add(questionSix)

            // 7
            val questionSeven = Question(
                7,
                "Which of the following words is the odd one out?",
                0,
                arrayListOf("Cat", "Dog", "Mouse", "Car"),
                3
            )
            questionsList.add(questionSeven)

            // 8
            val questionEight = Question(
                8,
                "If you rearrange the letters 'CIFAIPC', you would have the name of a:",
                0,
                arrayListOf("City", "Animal", "Ocean", "Country"),
                1
            )
            questionsList.add(questionEight)

            // 9
            val questionNine = Question(
                9,
                "If all squares are rectangles, are all rectangles squares?",
                0,
                arrayListOf("Yes", "No", "Cannot be determined", "None of the above"),
                1
            )
            questionsList.add(questionNine)

            // 10
            val questionTen = Question(
                10,
                "Which number does not belong in the following series: 2, 3, 5, 7, 11, 14, 17?",
                0,
                arrayListOf("2", "5", "11", "14"),
                3
            )
            questionsList.add(questionTen)
        }
    }

    return questionsList
}
