# spring-transaction-example

Why Do We Need Transaction Management?
Let’s understand transactions with the above example, if a user has entered his information the
user’s information gets stored in the user_info table. Now, to book a ticket he does an online
payment and due to some reason(system failure) the payment has been canceled so, the ticket is
not booked for him. But, the problem is that his information gets
stored on the user_info table. On a large scale, more than thousands of these things happen within

a single day. So, it is not good practice to store a single action of the transaction(Here, only
user info is stored not the payment info).

To overcome these problems, spring provides transaction management, which uses annotation to handl
e these issues. In such a scenario, spring stores the user information in temporary memory and then
checks for payment information if the payment is successful then it will complete the transaction ot
herwise it will roll back the transaction and the user information does not gets stored in the database.