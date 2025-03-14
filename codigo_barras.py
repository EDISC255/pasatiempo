import os
import barcode
from barcode.writer import ImageWriter

# Carpeta donde se guardaran los codigos de barras
output_folder = "barcodes"
os.makedirs(output_folder, exist_ok=True)

# Generar codigos de barras del 1 al 150
for i in range(1000000001, 1000000151):
    code = str(i)#.zfill(6)  # Formato con ceros a la izquierda (opcional)
    barcode_class = barcode.get_barcode_class("code128")  # Tipo de codigo de barras
    barcode_obj = barcode_class(code, writer=ImageWriter())

    # Guardar en archivo PNG
    filename = os.path.join(output_folder, f"barcode_{code}")
    barcode_obj.save(filename)

print("Codigos de barras generados correctamente.")
