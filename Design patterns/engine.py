from abc import ABC, abstractmethod


class Engine(ABC):
    @abstractmethod
    def use_engine(self) -> str:
        pass


class PythonEngine(Engine):
    def use_engine(self) -> str:
        return 'using python'


class WebEngine(Engine):
    def use_engine(self) -> str:
        return 'using web browser'


