object PasswordManager {

  def handlePassword(password: String): Unit = {
    // Simulating insecure password handling (DO NOT use this in real code)
    println("Handling password: " + password)
  }

  def main(args: Array[String]): Unit = {
    val password = "my_insecure_password"

    // Call a method to handle the password
    handlePassword(password)
  }
}