fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun halving(num: Int) : Int = num / 2 //round down

fun abilityCheck(
    d20: Int,
    abilityScoreModifier: Int,
    bonus: Int,
    penalty: Int,
    difficultyClass: Int,
) : Boolean {
    return check(d20, abilityScoreModifier, bonus, penalty, difficultyClass)
}

fun savingThrow(
    d20: Int,
    abilityScoreModifier: Int,
    bonus: Int,
    penalty: Int,
    difficultyClass: Int
) : Boolean {
    return check(d20, abilityScoreModifier, bonus, penalty, difficultyClass)
}

fun attackRoll(
    d20: Int,
    abilityScoreModifier: Int,
    bonus: Int,
    penalty: Int,
    armorClassOfTarget: Int
) : Boolean {
    return check(d20, abilityScoreModifier, bonus, penalty, armorClassOfTarget)
}

private fun check (
    d20: Int,
    abilityScoreModifier: Int,
    bonus: Int,
    penalty: Int,
    target: Int
): Boolean {
    return d20 + abilityScoreModifier + bonus - penalty > target
}

