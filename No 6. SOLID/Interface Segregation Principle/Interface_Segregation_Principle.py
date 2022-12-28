class BangunDatar:

    def luas():
        pass

class BangunRuang:

    def volume():
        pass

class Persegi(BangunDatar):

    def __init__(self, panjang):
        self.panjang = panjang

    def luas(self):
        return pow(self.panjang, 2)

class Kubus(BangunDatar, BangunRuang):

    def __init__(self, sisi):
        self.sisi = sisi

    def luas(self):
        return pow(self.sisi, 2)

    def volume(self):
        return pow(self.sisi, 3)

class KelolaKalkulasi:
    def calculate(self):
        pass

class Persegi(BangunDatar, KelolaKalkulasi):
    def __init__(self, panjang):
        self.panjang = panjang

    def luas(self):
        return pow(self.panjang, 2)

    def calculate(self):
        return self.luas()

class Kubus(BangunDatar, BangunRuang, KelolaKalkulasi):
    def __init__(self, sisi):
        self.sisi = sisi

    def luas(self):
        return pow(self.sisi, 2)

    def volume(self):
        return pow(self.sisi, 3)

    def calculate(self):
        return self.luas()

class Kalkulasi:

    def __init__(self, *args):
        self.bangunDatar = args

    def calculate(self):
        listLuas = []
        for objek in self.bangunDatar:
            if isinstance(objek, BangunDatar):
                luas = objek.calculate()
                listLuas.append(luas)
                continue

            raise Exception("This Object (",object,") Not Implementation of BangunDatar")
        return sum(listLuas)

    def output(self):
        return self.calculate()

if __name__ == "__main__":

    result = Kalkulasi(
        Kubus(4),
        Persegi(5),
        Persegi(6)
    )

    print("Jumlah luas dari bangunan : ", result.output())
