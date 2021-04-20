from engine import *


class GraphicInterface:
    def __init__(self, Engine) -> None:
        self.engine = Engine

    def create_component(self):
        pass


class Window(GraphicInterface):
    def create_component(self) -> str:
        return f'new window {self.engine.use_engine()}'


class Button(GraphicInterface):
    def create_component(self) -> str:
        return f'new button {self.engine.use_engine()}'