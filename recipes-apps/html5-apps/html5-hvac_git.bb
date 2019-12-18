# Copyright (c) 2018-2019 LG Electronics, Inc.

SUMMARY = "HTML5 HVAC"
AUTHOR = "Jose Dapena Paz <jose.dapena@lge.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

RDEPENDS_${PN} += "agl-service-hvac"

require html5-apps.inc

PR = "r0"

SRC_URI = "git://github.com/AGL-web-applications/hvac.git;protocol=https;branch=ces2020"
SRCREV = "${AUTOREV}"

do_aglwgt_package() {
    cd ${B}
    ${NPM_BIN} run build
    cp ${B}/package/hvac.wgt ${B}
}
