package com.hotel.pet.model.exception;

public class UserNaoEncontradoException extends RuntimeException {
    public UserNaoEncontradoException( ) {
        super("Usuário não encontrado");
    }
}
