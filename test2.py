import numpy as np
from scipy.integrate import quad

charge = 9.0e9  # Constante de Coulomb

def compute_electric_field_ring(ring_radius, observation_point):
    """
    Calculate electric field due to a ring charge at an observation point.
    """
    micro_coulomb = 1.0e-6
    
    ring_charge_density = micro_coulomb / (2 * np.pi * ring_radius)
    
    def integrand(dl, ring_radius, observation_point):
        return charge * ring_charge_density * observation_point / (ring_radius**2 + observation_point**2)**(1.5)
    
    E, _ = quad(integrand, 0, 2 * np.pi * ring_radius, args=(ring_radius, observation_point))
    E_formatted = "{:.2e}".format(E)
    return E_formatted

def calculate_electric_field_disk(disk_radius, x_position):
    """
    Compute electric field produced by a charged disk at a specific x position.
    """
    micro_coulomb = 1.0e-6
    
    disk_charge_density = micro_coulomb / (np.pi * disk_radius**2)
    
    def integrand(r, x_position):
        dA = 2 * np.pi * r
        dQ = disk_charge_density * dA
        return charge * dQ * x_position / (r**2 + x_position**2)**(3/2)
    
    E, _ = quad(integrand, 0, disk_radius, args=(x_position,))
    E_formatted = "{:.2e}".format(E)
    return E_formatted

def evaluate_electric_field_line(line_length, x_coord):
    """
    Evaluate electric field due to a line charge at a specific x-coordinate.
    """
    micro_coulomb = 1.0e-6
    
    line_charge_density = micro_coulomb / line_length
    
    def integrand(y, x_coord):
        dL = 1
        dQ = line_charge_density * dL
        return charge * dQ * x_coord / (x_coord**2 + y**2)**(3/2)
    
    E, _ = quad(integrand, -line_length/2, line_length/2, args=(x_coord,))
    E_formatted = "{:.2e}".format(E)
    return E_formatted

anillo = compute_electric_field_ring(1,1)
print(anillo)

disco = calculate_electric_field_disk(1,1)
print(disco)

vara = evaluate_electric_field_line(1, 1)
print(vara)