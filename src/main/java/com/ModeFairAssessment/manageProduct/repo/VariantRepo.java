package com.ModeFairAssessment.manageProduct.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ModeFairAssessment.manageProduct.model.Variation;

public interface VariantRepo extends JpaRepository<Variation, Integer> {


    @Query(value =
    "SELECT " +
    "    v.variation_id, v.adapter_type, v.chip_type, v.cpu_type, v.gpu_type, v.keyboard_type, v.memory_type, v.miscellaneous, v.price, v.product_id, v.storage_type, v.track_pad," +
    "    (SELECT JSON_ARRAYAGG(JSON_OBJECT('colorName', col.color_name, 'colorImageUrl', col.color_image_url)) " +
    "     FROM (SELECT DISTINCT c.color_name, c.color_image_url " +
    "           FROM color c " +
    "           JOIN variant_color vc ON c.color_id = vc.color_id " +
    "           WHERE vc.variation_id = v.variation_id) col" +
    "    ) AS colors," +
    "    i.image_url AS chip_image," +
    "    (SELECT JSON_ARRAYAGG(JSON_OBJECT('imageName', img.image_name, 'imageUrl', img.image_url)) " +
    "     FROM image img " +
    "     WHERE img.image_id IN (SELECT iv.image_id FROM variant_image iv WHERE iv.variation_id = v.variation_id) " +
    "    ) AS product_images" +
    " FROM" +
    "    variation v" +
    "    JOIN image i ON v.chip_type = i.image_name" +
    " GROUP BY" +
    "    v.variation_id, v.product_id, v.cpu_type, v.gpu_type, v.memory_type, v.storage_type, v.price, i.image_url",
    nativeQuery = true)

                List<Variation> getAllVariations();

    void deleteVariationByVariationId(int variation_id);

    Optional<Variation> findVariationByVariationId(int variation_id);
}
