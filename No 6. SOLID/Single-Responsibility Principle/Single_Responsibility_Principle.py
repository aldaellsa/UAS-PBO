class Lingkaran:

    def __init__(self, radius):
        self.radius = radius

class Persegi:

    def __init__(self, panjang):
        self.panjang = panjang

class Kalkulasi:

    def __init__(self, *args):
        self.bangunDatar = args

    def calculate(self):
        listLuas = []
        for objek in self.bangunDatar:
            luas = 0
            if type(objek).__name__ == 'Persegi':
                luas = objek.panjang * objek.panjang;
            elif type(objek).__name__ == 'Lingkaran':
                luas = 3.14 * objek.radius * objek.radius;
            listLuas.append(luas)

        return sum(listLuas)

    def output(self):
        return self.calculate()

if __name__ == "__main__":

    result = Kalkulasi(
        Lingkaran(2),
        Persegi(5),
        Persegi(6)
    )

    print("Jumlah luas dari bangunan : ", result.output())