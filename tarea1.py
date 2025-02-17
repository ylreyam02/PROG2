class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return f"({self.x}, {self.y})"

    #método de Newton
    def sqrt(self, number):
        t = number / 2
        while True:
            new_t = (t + number / t) / 2
            if abs(t - new_t) < 1e-6:  # Precisión
                break
            t = new_t
        return t

    #Taylor
    def atan(self, z):
        sum = z
        term = z
        for i in range(3, 15, 2):  # Más términos = mayor precisión
            term *= -z * z
            sum += term / i
        return sum

    def coord_polares(self):
        r = self.sqrt(self.x**2 + self.y**2)
        theta = self.atan(self.y / self.x) if self.x != 0 else 1.57  # Aproximamos π/2 para x = 0
        return f"(r: {r}, θ: {theta})"

    def __str__(self):
        return f"Punto: {self.coord_cartesianas()}"

# Prueba de la clase
if __name__ == "__main__":
    p = Punto(3, 4)
    print(p)
    print("Coordenadas polares:", p.coord_polares())
