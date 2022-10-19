package com.fuelmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class FuelManagementResourceNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1652216421820835910L;
        private String message;

        public FuelManagementResourceNotFoundException(String message) {
            super(message);
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String toString() {
            return "FuelManagementResourceNotFoundException(message=" + this.getMessage() + ")";
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof FuelManagementResourceNotFoundException)) {
                return false;
            } else {
                FuelManagementResourceNotFoundException other = (FuelManagementResourceNotFoundException)o;
                if (!other.canEqual(this)) {
                    return false;
                } else if (!super.equals(o)) {
                    return false;
                } else {
                    Object this$message = this.getMessage();
                    Object other$message = other.getMessage();
                    if (this$message == null) {
                        if (other$message != null) {
                            return false;
                        }
                    } else if (!this$message.equals(other$message)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(Object other) {
            return other instanceof FuelManagementResourceNotFoundException;
        }

        public int hashCode() {

            int result = super.hashCode();
            Object $message = this.getMessage();
            result = result * 59 + ($message == null ? 43 : $message.hashCode());
            return result;
        }
    }


