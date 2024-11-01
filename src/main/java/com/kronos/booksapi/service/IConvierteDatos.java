package com.kronos.booksapi.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
