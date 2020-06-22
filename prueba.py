# for Python3
import time
import tkinter as tk
from PIL import Image, ImageTk
import os
from paths import *

LARGE_FONT= ("Verdana", 12)
imagendoglist = [path_dogs1,path_dogs2,path_dogs3,path_dogs4]

gifB =False
canvas= None
class SeaofBTCapp(tk.Tk):

    def __init__(self, *args, **kwargs):
        tk.Tk.__init__(self, *args, **kwargs)
        self.attributes('-fullscreen', True)  
        self.fullScreenState = False
        self.configure(background='black')
        self.frames = {}
        self.bind("<F11>", self.toggleFullScreen)
        self.bind("<Escape>", self.quitFullScreen)
        self.bind("<q>", self.quitkey)
        button3=tk.Button(self, text="Gif",
                            command=self.gifCanva)
        button3.pack()
        tk.Canvas.__init__(self)
        label = tk.Label(self, text="Gif", font=LARGE_FONT)
        label.pack(pady=10,padx=10)

        photo = ImageTk.PhotoImage(file=imagendoglist[0])
        width = photo.width()
        height = photo.height()
        canvas = tk.Canvas(width=width, height=height)
        canvas.pack()
        
        gifB=True
            # loop through the gif image objects for a while
        giflist = []
        for imagefile in imagendoglist:
            photo = ImageTk.PhotoImage(file=imagefile)
            giflist.append(photo)
        # loop through the gif image objects for a while
        if (gifB == True):
            for k in range(0, 10):
                for gif in giflist:
                    canvas.delete(tk.ALL)
                    canvas.create_image(width/2.0, height/2.0, image=gif)
                    canvas.update()
                    time.sleep(0.1)    
            gifB=False    
        
    def show_frame(self, cont):

        frame = self.frames[cont]
        frame.tkraise()
    def toggleFullScreen(self, event):
        self.fullScreenState = not self.fullScreenState
        self.attributes("-fullscreen", self.fullScreenState)

    def quitFullScreen(self, event):
        self.fullScreenState = False
        self.attributes("-fullscreen", self.fullScreenState)
    def quitkey(self, event):
       self.destroy()
    def gifCanva(self):       
        #s
        print('F')
class StartPage(tk.Frame):

    def __init__(self, parent, controller):
        tk.Frame.__init__(self,parent)
        label = tk.Label(self, text="Start Page", font=LARGE_FONT)
        label.pack(pady=10,padx=10)

        button = tk.Button(self, text="Visit Page 1",
                            command=lambda: controller.show_frame(PageOne))
        button.pack()

        button2 = tk.Button(self, text="Visit Page 2",
                            command=lambda: controller.show_frame(PageTwo))
        button2.pack()
        button3=tk.Button(self, text="Gif",
                            command=self.gifCanva)
        button3.pack()
        # button4=tk.Button(self, text="Borrar Gif",
        #                     command=canvas.delete("all"))
        # button4.pack()

    def gifCanva(self):       
        tk.Canvas.__init__(self)
        label = tk.Label(self, text="Gif", font=LARGE_FONT)
        label.pack(pady=10,padx=10)

        photo = ImageTk.PhotoImage(file=imagendoglist[0])
        width = photo.width()
        height = photo.height()
        canvas = tk.Canvas(width=width, height=height)
        canvas.pack()
        
        gifB=True
            # loop through the gif image objects for a while
        giflist = []
        for imagefile in imagendoglist:
            photo = ImageTk.PhotoImage(file=imagefile)
            giflist.append(photo)
        # loop through the gif image objects for a while
        if (gifB == True):
            for k in range(0, 10):
                for gif in giflist:
                    canvas.delete(tk.ALL)
                    canvas.create_image(width/2.0, height/2.0, image=gif)
                    canvas.update()
                    time.sleep(0.1)    
            gifB=False        

class PageOne(tk.Frame):

    def __init__(self, parent, controller):
        tk.Frame.__init__(self, parent)
        label = tk.Label(self, text="Page One!!!", font=LARGE_FONT)
        label.pack(pady=10,padx=10)

        button1 = tk.Button(self, text="Back to Home",
                            command=lambda: controller.show_frame(StartPage))
        button1.pack()

        button2 = tk.Button(self, text="Page Two",
                            command=lambda: controller.show_frame(PageTwo))
        button2.pack()
        # self.gifCanva()
    def gifCanva(self):       
        tk.Canvas.__init__(self)
        label = tk.Label(self, text="Gif", font=LARGE_FONT)
        label.pack(pady=10,padx=10)

        photo = ImageTk.PhotoImage(file=imagendoglist[0])
        width = photo.width()
        height = photo.height()
        canvas = tk.Canvas(width=width, height=height)
        canvas.pack()
        gifB=True
            # loop through the gif image objects for a while
        giflist = []
        for imagefile in imagendoglist:
            photo = ImageTk.PhotoImage(file=imagefile)
            giflist.append(photo)
        # loop through the gif image objects for a while
        if (gifB == True):
            for k in range(0, 1000):
                for gif in giflist:
                    canvas.delete(tk.ALL)
                    canvas.create_image(width/2.0, height/2.0, image=gif)
                    canvas.update()
                    time.sleep(0.1)    
            gifB=False        

class PageTwo(tk.Frame):

    def __init__(self, parent, controller):
        tk.Frame.__init__(self, parent)
        label = tk.Label(self, text="Page Two!!!", font=LARGE_FONT)
        label.pack(pady=10,padx=10)

        button1 = tk.Button(self, text="Back to Home",
                            command=lambda: controller.show_frame(StartPage))
        button1.pack()

        button2 = tk.Button(self, text="Page One",
                            command=lambda: controller.show_frame(PageOne))
        button2.pack()


       
            
def main():
    app = SeaofBTCapp()
    app.mainloop()

if __name__ == '__main__':
    main()



