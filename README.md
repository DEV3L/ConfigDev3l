# ConfigDev3l
Implementation of Apache Commons Configuration

### Project Highlights:
* Simple API:
  * RandomSaltGenerator.createSalt() -> returns  [Hex encoded] String
  * Pbkdf2Encrypter.encrypt(password, salt) -> returns  [Hex encoded] String

## Eclipse Project Setup (Requires Maven)
 * git clone the project
 * From the project directory
  * mvn eclipse:eclipse
 * From within Eclipse workspace, import as existing project
