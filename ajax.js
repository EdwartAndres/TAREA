    $(document).ready(function() {
        // Agregar Comida Rápida - Envío Ajax
        $('#agregarForm').submit(function(event) {
            event.preventDefault();

            var formData = {
                nombre: $('#nombre').val(),
                codigo: $('#codigo').val(),
                precio: $('#precio').val(),
                descripcion: $('#descripcion').val()
            };

            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/comidas/agregarcomida',
                data: JSON.stringify(formData),
                contentType: 'application/json',
                success: function() {
                    alert('Comida agregada exitosamente');
                }
            });

            // Limpiar campos del formulario
            $('#nombre').val('');
            $('#codigo').val('');
            $('#precio').val('');
            $('#descripcion').val('');
        });

        // Listar Comidas Rápidas - Solicitud Ajax
        $('#listarBtn').click(function() {
            $.ajax({
                type: 'GET',
                url: 'http://localhost:8080/comidas/listarcomidas',
                success: function(data) {
                    const tablaComidas = $('#listaComidas');
                    tablaComidas.empty();

                    data.forEach(function(comida) {
                        var row = $('<tr>');
                        row.append($('<td>').text(comida.nombre));
                        row.append($('<td>').text(comida.codigo));
                        row.append($('<td>').text(comida.precio));
                        row.append($('<td>').text(comida.descripcion));
                        tablaComidas.append(row);
                    });
                }
            });
        });
    });
    console.log("hola")