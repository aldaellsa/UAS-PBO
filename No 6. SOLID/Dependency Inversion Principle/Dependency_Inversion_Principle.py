class Koneksi:

    def connect():
        pass

class MySQLConnection(Koneksi):

    def connect():
        return "Database Connection"

class ModelApp:

    def __init__(self, connection : Koneksi):
        self.connection = connection
