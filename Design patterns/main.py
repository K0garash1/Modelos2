from component_factory import *


class Main:
    factory = PythonFactory()
    window = factory.create_window()
    print(window.create_component())


if __name__ == "__main__":
    Main()
