package pe.edu.upeu.sisventas.controller;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sisventas.service.ICategoriaService;
import pe.edu.upeu.sisventas.service.IMarcaService;
import pe.edu.upeu.sisventas.service.IProductoService;
import pe.edu.upeu.sisventas.service.IUnidadMedidaService;

//xd

@RequiredArgsConstructor
public class ProductoController {
    private final IMarcaService ms;
    private final ICategoriaService cs;
    private final IProductoService ps;
    private final IUnidadMedidaService us;
}

