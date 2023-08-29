import math
from scipy import integrate

def calculate_electric_field(x, r, Q):
    E0 = 8.854187817e-12  # Constante de permitividad eléctrica del vacío
    numerator = Q * x
    denominator = 4 * math.pi * E0 * (x**2 + r**2)**(3/2)
    return numerator / denominator

def calculate_electric_field_at_point(x, r, Q):
    lambda_val = Q / (2 * math.pi * r)
    
    def integrand(ds):
        return lambda_val * 2 * math.pi * r * x * ds / math.sqrt(r**2 + x**2 *ds**2)
    
    integral_result, _ = integrate.quad(integrand, 0, 2 * math.pi * r)
    return integral_result

def main():
    x = float(input("Ingrese la coordenada x del punto en el eje x: "))
    r = float(input("Ingrese la distancia desde el origen al punto máximo del anillo (r): "))
    Q = float(input("Ingrese la carga total del anillo: "))
    
    electric_field = calculate_electric_field(x, r, Q)
    electric_field_integral = calculate_electric_field_at_point(x, r, Q)
    
    print(f"Campo eléctrico en el punto x = {x}: {electric_field} N/C or V/m")
    print(f"Campo eléctrico calculado mediante integral: {electric_field_integral} N/C or V/m")

if __name__ == "__main__":
    main()
