class BangunDatar:
    def luas():
        pass

class Lingkaran(BangunDatar):

    def __init__(self, radius):
        self.radius = radius

    def luas(self):
        return 3.14 * pow(self.radius, 2)

class Persegi(BangunDatar):

    def __init__(self, panjang):
        self.panjang = panjang

    def luas(self):
        return pow(self.panjang, 2)

class Kalkulasi:

    def calculate(self):
        listLuas = []
        for objek in self.BangunDatar:
            if isinstance(objek, BangunDatar):
                luas = objek.luas()
                listLuas.append(luas)
                return sum(listLuas)
            continue

    print("This Object (",object,") Not Implementation of BangunDatar")

