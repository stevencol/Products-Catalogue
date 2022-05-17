<div class="modal fade" id="regsisterUser1" aria-labelledby="exampleModalLabel" data-bs-backdrop="static">
    <form action="${pageContext.request.contextPath}/ClienteController?action=resgister" method="post">

        <div class="modal-dialog">
            <div class="modal-content  text-success">
                <div class="modal-header modal-title text-center">
                    <h5 class="modal-title text-center col-11" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>

                <div class="modal-body text-dark bg-white">

                    <div class="row">
                        <div class="col">
                            <label for="primerNombre">Primer Nombre</label>
                            <input type="text" placeholder="Primer nombre" name="primerNombre"  class="form-control"/>
                        </div>
                        <div class="col">
                            <label for="SegundoNombre">Segundo nombre</label>
                            <input type="text" placeholder="Segundo Nombre"  class="form-control" name="segundoNombre"/>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col">
                            <label for="primerApelldio">Primer Nombre</label>
                            <input type="text" placeholder="Primer Apellido"   class="form-control" name="primerApelldio"/>
                        </div>
                        <div class="col">
                            <label for="segundoApellido">Segundo Apellido</label>
                            <input type="text" placeholder="Segundo Apellido"  name="segundoApellido" class="form-control"/>
                        </div>

                    </div>

                    <div class="row">
                        <div class="col">
                            <label for="telefono">Telefono</label>
                            <input type="text" placeholder="Telefono"   class="form-control" name="telefono"/>
                        </div>
                        <div class="col">
                            <label for="documento">Documento</label>
                            <input type="text" placeholder="documento"  name="documento" class="form-control"/>
                        </div>

                    </div>


                    <div class="row">
                        <div class="col">
                            <label for="correo">Correo</label>
                            <input type="text" placeholder="Correo"   class="form-control" name="correo"/>
                        </div>
                        <div class="col">
                            <label for="foto">Foto</label>
                            <input type="file" placeholder="foto"   class="form-control" name="foto"/>
                        </div>


                    </div>

                    <div class="row">
                        <div class="col">
                            <label for="contraseña">Contraseña</label>
                            <input type="text" placeholder="Contrasena"   class="form-control" name="contrasena"/>
                        </div>
                        <div class="col">
                            <label for="confirmacion">Confirme la contraseña</label>
                            <input type="text" placeholder="Confirme la contraseña"  name="confirmacion" class="form-control"/>
                        </div>

                    </div>




                </div>

                <div class="modal-footer d-flex justify-content-center">
                    <button type="submit" class=" btn btn-dark col-5">Guardar</button>
                    <button type="button"class="btn btn-danger col-5 " data-bs-dismiss="modal">Close</button>
                </div>

            </div>

        </div>
    </form>

</div>

