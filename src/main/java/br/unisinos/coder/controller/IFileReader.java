package br.unisinos.coder.controller;

import java.io.InputStream;

public interface IFileReader {

    public Byte readSingleByte();

    public Byte[] readBytes(int n);

    public InputStream openStream(String fileName);

    public void closeStream();
}
