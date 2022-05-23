fun main(args: Array<String>) {
  val name = "Madrigal"
  var healthPoints = 89
  var isBlessed = true
  val isImmortal = false

  val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
  val healthStatus = formatHealthStatus(healthPoints, isBlessed)

  printPlayerStatus(auraColor, isBlessed, name, healthStatus)
  castFireball(5)
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String =  when (healthPoints) {
    100 -> " is in exellent condition!"
    in 90..99 -> " has a few stratches."
    in 75..89 -> if(isBlessed) {
      " has some minor wounds, but is healing quite quickly!"
    } else {
      " has some minor wounds."
    }
    in 15..74 -> "looks pretty hurt."
    else -> " is in awful conditions."
  }

private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
  println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "YES" else "NO"})")
  println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String =
  if(isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"

private fun castFireball(numFirebals: Int = 2) = println("A glass of Fireball springs into extence. (x$numFirebals)")

