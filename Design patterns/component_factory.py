from abc import ABC, abstractmethod
from engine import *
from gui_interface import *


class Componentfactory(ABC):
    @abstractmethod
    def create_button(self):
        pass

    def create_window(self):
        pass


class PythonFactory(Componentfactory):
    def __init__(self):
        self.engine = PythonEngine()

    def create_window(self):
        return Window(self.engine)

    def create_button(self):
        return Button(self.engine)


class WebFactory(Componentfactory):
    def __init__(self):
        self.engine = WebEngine()

    def create_window(self):
        return Window(self.engine)

    def create_button(self):
        return Button(self.engine)