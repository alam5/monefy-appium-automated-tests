Exploratory Testing Charters

Test charter- 01
Perform exploratory testing of UI/UX of the application  
Priority
Reason
High: Monefy app has alot visual representation and graphs that illustrate financial data.
Application
Monefy application
Environment
Production
Test Device
Google Pixel 9 Pro XL
Platform
Android
Duration
60 mins
Bugs:
The Pie Donut chart does not accurately visualize data when all expense categories are added.
The font size for newly created accounts is too small, making it difficult to read.
The left menu opens unexpectedly when the user clicks the back button while the right menu is open.
There is no "Clear All" button available on the numeric keyboard.
Deleting a record does not prompt a confirmation message.
The line annotation for categories does not function correctly when expenses increase.
The top menu overlaps with the search results menu and the delete icon when displayed.
It is challenging to tap the ‘delete’ and ‘search’ icon located in the top right corner.
When a user long taps on a record, they can still perform other operations on the screen.
Two burger menus appear below and beside the "Balance" section, which slide open upwards. Typically, burger menus are located in the top left or right corners of apps.
Expenses are displayed below the "Balance" section, which may cause confusion.











Test charter - 02
Check that adding Balance and Expense calculations are working as expected
Priority
High: Balance and expense functionality are very critical for financial apps like Monefy


Application
Monefy application
Environment
Production
Test Device
Google Pixel 9 Pro XL
Platform
Android
Duration
60 mins
Bugs:
Smaller expense percentage value is rounded to zero when other expenses are high very high
Colors change when user tap and hold on category icons.






Test charter - 03
Check Account creation workflow
Priority
Highest:
- Monefy app has alot visual representation and graphs.
  Application
  Monefy application
  Environment
  Production
  Test Device
  Google Pixel 9 Pro XL
  Platform
  Android
  Duration
  2 hrs
  Bugs:
  Initial account balance does not appear in total balance amount
  When creating account placeholder text ‘‘Name’’ appear as entered text
  User can




Test charter - 04
Top Search functionality
Priority
Medium:
Application
Monefy application
Environment
Production
Test Device
Google Pixel 9 Pro XL
Platform
Android
Duration
2 hrs
Bugs:
Top bar overlaps with search query is entered
When using less than or greater operators e.g “<500” or “>500” than search results showing values = 500.




Q: ​What kind of risks do you need to mitigate for this type of application?
Answer: Following are the risk that should be mitigate:
UI/UX Improvements: The user journey within the app is challenging to comprehend, and the overall user experience requires significant enhancements to ensure clarity and ease of use.App needs to be more user-friendly.
Functionality: The process of adding and tracking expenses and income over extended periods is not intuitive.
Deleting an expense or deposit category removes all associated historical amounts, and there is currently no way to review past transactions, which can lead to confusion and potential data loss.
User Accessibility: From an accessibility standpoint, the use of colorful representations of donut charts for expenses may pose difficulties for individuals who are colorblind or elderly. It's essential to implement more inclusive design choices to accommodate all users.
Calendar dates:Users are currently able to add expenses for dates that are far in the past or far in the future, which is not a practical feature and may lead to confusion in financial tracking.



