# facturasJava

* Inyección de dependencias con interfaces
* Anotaciones `@Service`, `@Repository`, `@Component`
* Scopes como `@RequestScope` o `@SessionScope`
* Lectura desde `.properties` y JSON
* Gestión de beans con `@Configuration`, `@Bean`, `@Primary`, `@Qualifier`

---

## 🛠 Proyecto: **Gestor de Impuestos y Facturas**

Un proyecto sencillo pero realista donde aplicas los conceptos de Spring que has aprendido, sin necesidad aún de base de datos.

### 🧩 Descripción

> Simulas una API REST que calcula el precio final de una factura aplicando impuestos dinámicos según el país del cliente. Los impuestos se leen desde archivos `.properties` y `.json`, y las clases están conectadas por inyección de dependencias.

---

## 📁 Estructura del proyecto

```
com.facturas
├── controller
│   └── FacturaController.java
├── service
│   ├── FacturaService.java
│   └── ImpuestoService.java
├── repository
│   ├── ImpuestoRepository.java
│   └── JsonImpuestoRepository.java
│   └── PropertiesImpuestoRepository.java
├── model
│   └── Factura.java
│   └── Impuesto.java
├── config
│   └── AppConfig.java
├── resources
│   ├── application.properties
│   ├── impuestos.json
```

---

## 🎯 Funcionalidades

1. **POST `/factura`** → Recibe una factura con precio base y país, devuelve el precio final con impuestos.
2. **El sistema lee impuestos**:

   * Desde `application.properties` para algunos países
   * Desde un archivo `impuestos.json` para otros
3. El tipo de repositorio de impuestos se decide con `@Qualifier` o `@Primary`.
4. Uso de `@Service`, `@Component`, interfaces y scopes (`RequestScope`).
5. Precio del IVA configurado como Bean con `@Configuration + @Bean`.

---

## 🔧 ¿Qué conceptos aplicas?

| Concepto                     | Aplicación en el proyecto                         |
| ---------------------------- | ------------------------------------------------- |
| `@Autowired` / interfaces    | Inyección entre controller → service → repository |
| `@Component`, `@Service`     | Estructuración clara por capas                    |
| `@Repository` y `@Qualifier` | Inyección de distintas implementaciones           |
| `@Configuration` + `@Bean`   | Inyección de beans creados manualmente            |
| `@Value`                     | Leer datos del `.properties`                      |
| `@RequestScope`              | Controlar el ciclo de vida de una factura         |
| `Cloneable` e inmutabilidad  | Proteger el modelo `Factura` e `Impuesto`         |

---

## 💡 ¿Qué te puedo entregar?

Si quieres, puedo prepararte ahora:

1. 📦 Un **proyecto base** con estructura vacía y código esqueleto para que lo rellenes tú
2. 🧪 Un conjunto de **requisitos y pruebas funcionales**
3. ✍️ O incluso una guía paso a paso tipo “reto” para que lo desarrolles por fases

¿Te gustaría que lo monte en ese formato y lo puedas ir completando tú activamente?
