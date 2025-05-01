#!/bin/bash

# Directorio raíz
ROOT_DIR="casestudies"

# Buscar todos los archivos que coincidan con el patrón RepOKClass*.java
find "$ROOT_DIR" -type f -name 'RepOKClass[1-5].java' | while read -r file; do
    # Extraer el número de clase N
    class_num=$(echo "$file" | grep -oP 'RepOKClass\K[1-5]')
    
    # Mostrar el archivo que se está procesando
    echo "Procesando $file -> repOK_$class_num / property_$class_num"

    # Reemplazar método repOK por repOK_i, y property por property_i
    # Solo si se trata de la definición del método
    sed -i -E \
        -e "s/\b(repOK)\b/repOK_${class_num}/g" \
        -e "s/\b(property)\b/property_${class_num}/g" \
        "$file"
done
