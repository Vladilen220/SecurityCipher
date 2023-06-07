# SecurityCipher 

The project focuses on two fundamental encryption techniques: the Caesar cipher and the Monoalphabetic cipher. Both ciphers have played significant roles in the history of cryptography and provide a starting point for understanding encryption principles and techniques.

## Algorithms
- The Caesar cipher, named after Julius Caesar, is one of the earliest known encryption methods. It is a substitution cipher that operates by shifting each letter in the plaintext by a fixed number of positions in the alphabet. For example, with a shift of 3, 'A' becomes 'D', 'B' becomes 'E', and so on. Despite its simplicity, the Caesar cipher was effective in securing communication during Caesar's time and still serves as an important concept in modern cryptography.

- The Monoalphabetic cipher, on the other hand, is a substitution cipher that uses a one-to-one mapping between characters in the plaintext and ciphertext. Each letter in the plaintext is replaced with a corresponding letter from a predefined substitution alphabet. Unlike the Caesar cipher, which has a fixed shift, the Monoalphabetic cipher provides complete flexibility in the mapping of characters.

The project provides implementations for both the encryption and decryption processes for the Caesar and Monoalphabetic ciphers. The encryption process involves taking a plain text message and transforming it into ciphertext using the specified cipher algorithm. The decryption process reverses this transformation, taking the ciphertext and converting it back to the original plaintext.

The project offers a user-friendly interface for interacting with the ciphers, allowing users to input their text and choose between encryption and decryption. Additionally, users can specify the shift key for the Caesar cipher or the substitution alphabet for the Monoalphabetic cipher.

Understanding these classic ciphers lays the groundwork for exploring more advanced encryption techniques. The project serves as a starting point for individuals interested in cryptography, information security, or those who simply want to gain a deeper understanding of how encryption and decryption processes work.

By providing practical implementations of the Caesar and Monoalphabetic ciphers, this project offers a hands-on learning experience and a stepping stone for further exploration into the fascinating world of encryption. It encourages users to experiment with different shift values, substitution alphabets, and to expand their knowledge by studying more sophisticated encryption methods and cryptographic systems.

To run and install the program, follow the steps below:

1- Setting up the Environment:

- Make sure you have Java Development Kit (JDK) installed on your machine.
- Set up a Java development environment (e.g., Eclipse, IntelliJ IDEA) or use a text editor to write and compile Java code.

2- File Structure:

- Create a new Java project or directory to store the code files.
- Organize the files in the following structure:
    - security (package)
        - Cipher.java (containing the implementation of cipher algorithms)
        - AppGUI.java (containing the GUI implementation)
        - Security.java (main class to run the program)
3- Compiling the Code:
- Open your preferred command-line interface or integrated development environment (IDE).
- Navigate to the project directory containing the Java files.
- Compile the Java files using the javac command. For example:
```text
javac security/*.java
```
4- Running the Program:

After successful compilation, execute the program by running the Security class.
Use the java command followed by the main class name. For example:
```text
java security.Security
```

5- GUI Usage:
- Once the program starts running, a graphical user interface (GUI) will appear.
- You can input a plain text or cipher text in the provided text fields.
- Select the desired encryption or decryption algorithm (Caesar or substitution).
- Specify the shift key for the Caesar cipher, if applicable.
- Click on the appropriate "Encrypt" or "Decrypt" button to perform the respective operation.
- The result will be displayed in the output field.

