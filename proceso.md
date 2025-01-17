1. Breve descripción del proceso realizado.

Empezamos creando no diagrama as clases de conferencia
 e sesion asignandolle unha relacion de cardinalidad 

- conferencia a sesion 0..N
- sesion a conferencia sin derteminar

Tras leer o segundo punto no diagrama actualizamos a
 relacion de asociacion a unha composicion e ca 
seguinte carindalida. Aqui se determinan alguns atributos
como data e hora de inicio na clase sesion

- conferencia a sesion 0..N
- sesion a conferencia 1

Tras leer o terceiro punto añadense as clases participante
e inscripcion por un momento pensouse nunha generalización, 
pero non consideramos atributos propios votando un vistazo
 aos seguintes puntos así que non a fixemos. Aqui se xa se
determinan alguns atributos coma tipo en participantes e 
un metodo en inscripcion chamado cambioEstado

O primer caso de cardinalida que trataremos e entre participante
 e inscripcion

- inscripcion a participante 1
- participante a inscripcion 1..N

A segunda caso de cadinalidad que trataremos e entre inscripcion e
 conferencia
- inscripcion a conferencia 1
- conferencia a inscripcion 1..N

No cuarto punto añadimos unha nova clase chamada artigos e creamos 
unha asociación con sesion e a clase artigo ten o atributo duracion.
A cardinalidade entre artigo e sesion e a seguinte
- artigo a sesion 0..N //suposto
- sesion a artigo 1..N

No quinto punto añadimos unha nova clase que e autor maila sua carnalidade.
Supomos que o autor vai ter como minimo 1 artigo para ser un autor
e un artigo poder ter varios 1 ou mais autores

- autor a artigo 1..N
- artigo a autor 1..N

No sexto punto añadimos algun que outro atributo extra sobre os obrigatorios
que consideramos como se podra ver no punto 2 co codigo fonte ou no propio
codigo java

2. Código fuente del diagrama anotado en sus etiquetas.

classDiagram
class conferencia
conferencia : -Int sala
conferencia : -String lugar
class sesion
sesion : -datetime inicio
sesion : -Int duracion // minutos
class participantes
participantes : -String nombre
participantes : -String apellidos
%% orador-publico
participantes : -String tipo
class artigo
artigo : -String tema
%% curto*largo
artigo : -String duracion
class autor
autor : -String nombre
autor : -String apellidos
class incripcion
%% confirmado-cancelado
incripcion : -Boolean estado
incripcion : -date fechaIncripcion
incripcion : -Int prezo
incripcion : +cambioEstado()

conferencia "1" *-- "0..N" sesion
participantes "1" o-- "1..N"incripcion
conferencia "1" o-- "1..N" incripcion
artigo "1..N" -- "0..N" sesion
autor "1..N" -- "1..N" artigo



3. Código java de las clases.


