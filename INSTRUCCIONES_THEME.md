# 🎨 Cómo Agregar Theme FlatLaf a tu Formulario JFormDesigner

## ✅ Lo que ya está hecho:

1. ✅ **Biblioteca descargada**: `lib/flatlaf-3.5.2.jar`
2. ✅ **Código actualizado**: El método `main` ya tiene la configuración del theme
3. ✅ **Módulo actualizado**: El archivo `.iml` incluye la biblioteca

## 📋 Pasos para activar el theme en IntelliJ IDEA:

### Paso 1: Recargar el proyecto
1. En IntelliJ IDEA, ve a **File → Invalidate Caches / Restart**
2. O simplemente cierra y vuelve a abrir el proyecto

### Paso 2: Verificar que la biblioteca está agregada
1. Ve a **File → Project Structure** (Ctrl + Alt + Shift + S)
2. En **Modules → POO-Forms → Dependencies**
3. Deberías ver `flatlaf-3.5.2.jar` en la lista
4. Si NO aparece, haz clic en el botón **+** y selecciona **JARs or directories**
5. Navega a la carpeta `lib` y selecciona `flatlaf-3.5.2.jar`

### Paso 3: Ejecutar el formulario
1. Abre el archivo `FormEstudiantes.java`
2. Haz clic derecho en el método `main`
3. Selecciona **Run 'FormEstudiantes.main()'**

## 🎨 Themes disponibles para cambiar:

En el archivo `FormEstudiantes.java`, línea 53, puedes cambiar el theme usando una de estas opciones:

```java
// OPCIÓN 1: Tema oscuro (actual)
UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatDarkLaf());

// OPCIÓN 2: Tema claro
UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());

// OPCIÓN 3: Tema IntelliJ (claro)
UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatIntelliJLaf());

// OPCIÓN 4: Tema Darcula (oscuro estilo IntelliJ)
UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatDarculaLaf());
```

## 🔧 Solución de problemas:

### Si aparece "Cannot resolve symbol 'formdev'":
1. Recarga el proyecto: **File → Invalidate Caches / Restart**
2. O sincroniza el proyecto: **File → Sync Project with Gradle/Maven** (si aplica)

### Si la biblioteca no se carga:
1. Verifica que `lib/flatlaf-3.5.2.jar` existe
2. Agrega manualmente la biblioteca desde **Project Structure**

## 📚 Información adicional:

- **Sitio oficial de FlatLaf**: https://www.formdev.com/flatlaf/
- **Versión instalada**: 3.5.2
- **Documentación**: https://www.formdev.com/flatlaf/themes/

## 🚀 Ejemplo de uso en JFormDesigner:

El theme se aplica automáticamente cuando ejecutas la aplicación. No necesitas hacer cambios en el archivo `.jfd`. 

Para diseñar con el theme en JFormDesigner:
1. Abre `FormEstudiantes.jfd` en JFormDesigner
2. Ve a **Preview → Look & Feel**
3. Selecciona **FlatLaf - Dark** o el theme que prefieras
4. Ahora puedes diseñar viendo cómo se verá con el theme aplicado

