package com.project.consult.persistence.entity.projection;

import java.time.LocalDateTime;

public interface UserProjection {
    Integer getId();
    Integer getNdoc();
    String getNombre();
    String getApellido();
    LocalDateTime getFecha();
}
