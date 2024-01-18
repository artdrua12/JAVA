package main.homework.lesson30.builder;

public final class Airplane {
    private String name;
    private String engine;
    private String type;
    private Number countMan;

    Airplane(Builder builder) {
        this.name = builder.name;
        this.engine = builder.engine;
        this.type = builder.type;
        this.countMan = builder.countMan;
    }

    public static class Builder {

        private String name;
        private Number countMan;
        private String type;
        private String engine;

        public Builder(String name) {
            if (name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.name = name;
        }

        public Builder addEngine(String engine) {
            this.engine = engine;
            System.out.println("addEngine");
            return this;
        }

        public Builder addType(String type) {
            this.type = type;
            System.out.println("addType");
            return this;
        }

        public Builder addCountMan(Number countMan) {
            this.countMan = countMan;
            System.out.println("addCountMan");
            return this;
        }

        public Airplane build() {
            System.out.println("Aiplane is ready");
            return new Airplane(this);
        }
    }
}
