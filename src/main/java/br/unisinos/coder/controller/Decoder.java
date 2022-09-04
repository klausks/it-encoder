package br.unisinos.coder.controller;

import br.unisinos.coder.strategy.DecodingStrategy;

public class Decoder {
    private DecodingStrategy decodingStrategy;

    public Decoder(DecodingStrategy decodingStrategy) {
        this.decodingStrategy = decodingStrategy;
    }
}
