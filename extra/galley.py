import time
import tkinter as tk
from PIL import Image, ImageTk
import os
from paths import *

image_list = [path_dogs1, path_dogs2, path_dogs3]
text_list = ['apple', 'bird', 'cat']
current = 0

def move(delta):
    global current, image_list
    if not (0 <= current + delta < len(image_list)):
        tkMessageBox.showinfo('End', 'No more image.')
        return
    current += delta
    image = Image.open(image_list[current])
    photo = ImageTk.PhotoImage(image)
    label['text'] = text_list[current]
    label['image'] = photo
    label.photo = photo


root = tk.Tk()

label = tk.Label(root, compound=tk.TOP)
label.pack()

frame = tk.Frame(root)
frame.pack()

tk.Button(frame, text='Previous picture', command=lambda: move(-1)).pack(side=tk.LEFT)
tk.Button(frame, text='Next picture', command=lambda: move(+1)).pack(side=tk.LEFT)
tk.Button(frame, text='Quit', command=root.quit).pack(side=tk.LEFT)

move(0)

root.mainloop()