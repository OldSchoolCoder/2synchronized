package ru.job4j;

public final class DCLSingleton {
    private static DCLSingleton inst;

    //Не нужно производить синхронизацию по всему классу - это избыточно
    //достаточно синхронизировать только метод instOf
    public synchronized static DCLSingleton instOf() {
        if (inst == null) {
            inst = new DCLSingleton();
        }
        return inst;
    }

    private DCLSingleton() {
    }
}
