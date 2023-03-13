

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://S98lddmodules"
SRCREV = "1"

FILES:${PN} += "${sysconfdir}/init.d/S98lddmodules"

inherit update-rc.d
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME:${PN} = "S98lddmodules"


do_install() {

    install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/S98lddmodules ${D}${sysconfdir}/init.d/
}