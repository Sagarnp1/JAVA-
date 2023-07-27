#include <iostream>
#include <vector>
#include <string>

using namespace std;

struct Task {
    string description;
    bool completed;
};

int main() {
    vector<Task> tasks;

    while (true) {
        cout << "\nTo-Do List Application\n";
        cout << "Press 1. to Add Task\n";
        cout << "Press 2. to Remove Task\n";
        cout << "Press 3. to List Tasks\n";
        cout << "Press 4. to Mark Task as Completed\n";
        cout << "Press 5. to Exit the application\n";
        cout << "Enter your choice (1-5): ";

        int choice;
        cin >> choice;

        if (choice == 1) {
            cout << "Enter task description: ";
            string description;
            cin.ignore();
            getline(cin, description);

            tasks.push_back({description, false});
            cout << "Task added successfully!\n";
        } else if (choice == 2) {
            if (tasks.empty()) {
                cout << "No tasks to remove.\n";
            } else {
                cout << "Select the task number to remove (1-" << tasks.size() << "): ";
                int taskNum;
                cin >> taskNum;

                if (taskNum > 0 && taskNum <= tasks.size()) {
                    tasks.erase(tasks.begin() + taskNum - 1);
                    cout << "Task has been removed successfully!\n";
                } else {
                    cout << "There is no  task number.\n";
                }
            }
        } else if (choice == 3) {
            if (tasks.empty()) {
                cout << " There is No tasks found.\n";
            } else {
                cout << "===== Tasks =====\n";
                for (size_t i = 0; i < tasks.size(); ++i) {
                    cout << i + 1 << ". " << (tasks[i].completed ? "[X] " : "[ ] ") << tasks[i].description << "\n";
                }
                cout << "=================\n";
            }
        } else if (choice == 4) {
            if (tasks.empty()) {
                cout << "No tasks to mark as completed.\n";
            } else {
                cout << "Select the task number to mark as completed (1-" << tasks.size() << "): ";
                int taskNum;
                cin >> taskNum;

                if (taskNum > 0 && taskNum <= tasks.size()) {
                    tasks[taskNum - 1].completed = true;
                    cout << "The above task is marked as completed!\n";
                } else {
                    cout << "There is no  task number.\n";
                }
            }
        } else if (choice == 5) {
            cout << "Exiting the application. Thanks for using my app!!!!!!!!   (Sagarnp)\n";
            break;
        } else {
            cout << "THere is no choice. Come again.\n";
        }
    }

    return 0;
}
