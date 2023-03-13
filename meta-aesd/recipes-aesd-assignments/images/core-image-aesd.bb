inherit core-image
CORE_IMAGE_EXTRA_INSTALL += "aesd-assignments"
CORE_IMAGE_EXTRA_INSTALL += "aesdchar-autostart"
CORE_IMAGE_EXTRA_INSTALL += "ldd-modules-autostart"
CORE_IMAGE_EXTRA_INSTALL += "aesdchar"
CORE_IMAGE_EXTRA_INSTALL += "kernel-module-faulty"
CORE_IMAGE_EXTRA_INSTALL += "kernel-module-hello"
CORE_IMAGE_EXTRA_INSTALL += "ldd-scull"
CORE_IMAGE_EXTRA_INSTALL += "openssh"
inherit extrausers
# See https://docs.yoctoproject.org/singleindex.html#extrausers-bbclass
# We set a default password of root to match our busybox instance setup
# Don't do this in a production image
# PASSWD below is set to the output of
# printf "%q" $(mkpasswd -m sha256crypt root) to hash the "root" password
# string
PASSWD = "\$5\$2WoxjAdaC2\$l4aj6Is.EWkD72Vt.byhM5qRtF9HcCM/5YpbxpmvNB5"
EXTRA_USERS_PARAMS = "usermod -p '${PASSWD}' root;"
