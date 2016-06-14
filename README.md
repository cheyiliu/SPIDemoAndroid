# SPIDemoAndroid
* Demo of SPI android

# key point
* define interface
```
package com.example.spi;

public interface iAdd {
    int add(int a, int b);

    double add(double a, double b);
}

```

* implement the interface
```
package com.example.spi;

public class iAddImpl implements iAdd {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }
}

```

* config the META-INF/services
```
see file and its content, com.example.spi.iAdd
```

* use ServiceLoader to load the impl
```
    private void handleSpiCall() {
        ServiceLoader<iAdd> addLoader = ServiceLoader.load(iAdd.class, getClassLoader());
        if (addLoader != null) {
            iAdd add = addLoader.iterator().next();
            if (add != null) {
                Log.i("test123", "123+567=" + add.add(123, 567));
            }
        }
    }
```

# read more
* https://github.com/cheyiliu/All-in-One/wiki/spi_service_provider_interface
