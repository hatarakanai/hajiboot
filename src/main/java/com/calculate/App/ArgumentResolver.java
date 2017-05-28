package com.calculate.App;

import java.io.InputStream;

public interface ArgumentResolver {
    Argument resolve(InputStream stream);
}
