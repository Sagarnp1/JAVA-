import tkinter as tk
from tkinter import ttk, messagebox
import sqlite3

class RestaurantDBApp:
    def __init__(self, master):
        self.master = master
        self.master.title("Restaurant Menu")
        
        # Connect to the database or create if it doesn't exist
        self.connection = sqlite3.connect("restaurant.db")
        self.cursor = self.connection.cursor()
        
        # Create table if it doesn't exist
        self.cursor.execute('''CREATE TABLE IF NOT EXISTS menu (
                                id INTEGER PRIMARY KEY,
                                item_name TEXT NOT NULL,
                                price REAL NOT NULL
                                )''')
        
        # Menu items
        self.menu_items = [
            ("Water", 20),
            ("Cold Drink", 60),
            ("Veg Momo", 90),
            ("Chowmein", 70),
            ("Buff Momo", 120),
            ("Chicken Chowmein", 150),
            ("Biryani", 190)
        ]
        
        # Determine text size based on window width
        window_width = self.master.winfo_screenwidth()
        self.text_size = int(window_width / 100)  # Adjust the denominator to control the text size
        
        # Configure bluish yellow colors
        self.bluish_yellow = "#EED202"  # bluish yellow color
        
        # Create GUI elements
        self.selected_items = []
        
        # Configure style for Checkbutton and Button
        self.style = ttk.Style()
        self.style.configure("Custom.TCheckbutton", background=self.bluish_yellow, font=("Helvetica", self.text_size))
        self.style.configure("Custom.TButton", background=self.bluish_yellow, font=("Helvetica", self.text_size))
        
        # Create labels
        ttk.Label(master, text="Restaurant Menu", font=("Helvetica", 16, "bold"), background=self.bluish_yellow).grid(row=0, column=0, columnspan=2, pady=10, sticky="ew")
        ttk.Separator(master, orient=tk.HORIZONTAL).grid(row=1, column=0, columnspan=2, sticky="ew", pady=5)
        
        # Create checkboxes for menu items
        for index, (item_name, price) in enumerate(self.menu_items):
            checkbox = ttk.Checkbutton(master, text=f"{item_name} - Rs.{price}", command=lambda idx=index: self.select_item(idx), style="Custom.TCheckbutton")
            checkbox.grid(row=index+2, column=0, sticky="w", padx=10, pady=5)
        
        # Create "Confirm Order" button
        self.confirm_button = ttk.Button(master, text="Confirm Order", command=self.confirm_order, style="Custom.TButton")
        self.confirm_button.grid(row=len(self.menu_items)+2, column=0, columnspan=2, pady=10, sticky="ew")
    
    def select_item(self, index):
        if index not in self.selected_items:
            self.selected_items.append(index)
        else:
            self.selected_items.remove(index)
    
    def confirm_order(self):
        if not self.selected_items:
            messagebox.showerror("Error", "Please select at least one item.")
            return
        
        total_price = sum(self.menu_items[idx][1] for idx in self.selected_items)
        messagebox.showinfo("Order Confirmation", f"Total Price: Rs.{total_price}")

def main():
    root = tk.Tk()
    app = RestaurantDBApp(root)
    root.configure(background="#EED202")  # Set background color to bluish yellow
    
    # Center the window on the screen
    window_width = root.winfo_screenwidth()
    window_height = root.winfo_screenheight()
    x_offset = (window_width - root.winfo_reqwidth()) // 2
    y_offset = (window_height - root.winfo_reqheight()) // 2
    root.geometry("+{}+{}".format(x_offset, y_offset))
    
    root.mainloop()

if __name__ == "__main__":
    main()
