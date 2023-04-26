package net.lizhao.cdm.shell;

import net.lizhao.cdm.*;
import org.springframework.shell.standard.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.regnosys.rosetta.common.serialisation.RosettaObjectMapper;

@ShellComponent
public class ProductCommand {

    @ShellMethod(key="new-prod", value="create a new product")
    public String create(@ShellOption({"-N","--name"}) String name) throws com.fasterxml.jackson.core.JsonProcessingException {
        Product.ProductBuilder prodBuilder = Product.builder();
        prodBuilder.setName(name);

        ObjectMapper objectMapper = RosettaObjectMapper.getNewMinimalRosettaObjectMapper();
        return objectMapper.writeValueAsString(prodBuilder.build());
    }
}
