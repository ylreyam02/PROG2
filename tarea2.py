import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x}, {self.y})"

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Línea de {self.p1} a {self.p2}"

    def dibujaLinea(self):
        plt.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], 'bo-')
        plt.xlim(0, 10)
        plt.ylim(0, 10)
        plt.grid()
        plt.show()

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo con centro en {self.centro} y radio {self.radio}"

    def dibujaCirculo(self):
        fig, ax = plt.subplots()
        circle = plt.Circle((self.centro.x, self.centro.y), self.radio, fill=False, edgecolor='r')
        ax.add_patch(circle)
        ax.set_xlim(0, 10)
        ax.set_ylim(0, 10)
        plt.grid()
        plt.show()

# Ejemplo de uso
p1 = Punto(2, 3)
p2 = Punto(7, 8)
linea = Linea(p1, p2)
print(linea)
linea.dibujaLinea()

centro = Punto(5, 5)
circulo = Circulo(centro, 3)
print(circulo)
circulo.dibujaCirculo()
