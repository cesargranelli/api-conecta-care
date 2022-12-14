package com.sevenine.conecta.mapper.consulta;

import com.sevenine.conecta.controllers.data.response.ComplementoResponse;
import com.sevenine.conecta.repository.data.Complemento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage = "<PACKAGE_NAME>.impl")
public interface ConsultaComplementoMapper {

    ComplementoResponse fromEntityData(Complemento complemento);

}
