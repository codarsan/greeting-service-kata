# Goals
The goal of this exercise is to come up with a solution that is

- Testable: we should be able to test the internal application logic with no need to ever send a real email.
- Well-designed: separate clearly the business logic from the infrastructure.


**Testability**
A test is not a unit test if:

- It talks to a database
- It communicates across the network
- It touches the file system
- You have to do things to your environment to run it (eg, change config files, comment line)

Tests that do this are integration tests.